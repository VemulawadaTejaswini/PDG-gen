import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {





    public static void main(String[] args){
      


        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int lineNum=1;
            int theSize = 0;
            
        while(true) {

            String s = br.readLine();
            
            int sInt = 1;
            if(s.equals("0")){
                sInt = 0;
            }
            int ret = -1;
            
            


            if (lineNum % 2 != 0 && sInt != 0) {
                lineNum++;
                theSize = Integer.parseInt(s);

            } else if (lineNum % 2 == 0 && sInt != 0){


                String[] array = s.split(" ");

                ArrayList<Integer> arrayList = new ArrayList<Integer>();

                for (String string : array) {
                    int i = Integer.parseInt(string);
                    arrayList.add(i);
                }


                Map<Integer, Long> map = arrayList.stream().collect(
                        Collectors.groupingBy(x -> x, Collectors.counting())
                );


                for (Map.Entry<Integer, Long> e : map.entrySet()) {

                    Long f = e.getValue();

                    if (f > theSize/ 2 + 0.5) {
                        ret = e.getKey();
                        System.out.println(ret);
                        break;
                    }
                }
                if (ret == -1){
                    System.out.println("NO COLOR");
                }

                lineNum++;

            }else{

                break;
            }

        }

        }catch(IOException e){
            System.out.println(e);
        }


    }





}