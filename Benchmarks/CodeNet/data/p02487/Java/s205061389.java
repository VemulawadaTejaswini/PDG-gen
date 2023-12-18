import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        ArrayList<String> list = new ArrayList<String>();
        String str;
        int a,b;
 
        try {
            for(;;){
                str = br.readLine();
 
                if(str.equals("0 0")){
                    break;
                }
 
                list.add(str);
 
            }
 
            for(int i=0;i<list.size();i++){
                a = Integer.parseInt((String) list.get(i).substring(0, list.get(i).indexOf(" ")));
                b = Integer.parseInt((String) list.get(i).substring(list.get(i).indexOf(" ")+1, list.get(i).length()));
 
                for(int h=0;h<a;h++){
                    for(int w=0;w<b;w++){
                        if(h==0 || h==a-1 || w==0 || w== b-1){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}