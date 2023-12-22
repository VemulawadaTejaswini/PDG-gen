import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int num = Integer.parseInt(line);

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < num; i++) {
            list.add(br.readLine());
        }


        findCard("S", list);
        findCard("H", list);
        findCard("C", list);
        findCard("D", list);

        /*

        for (int i = 1; i <= 13; i++) {
            if(list.contains("S " + i) == false){
                System.out.println("S " + i);
            }
        }

        for (int i = 1; i <= 13; i++) {
            if(list.contains("H " + i) == false){
                System.out.println("H " + i);
            }
        }

        for (int i = 1; i <= 13; i++) {
            if(list.contains("C " + i) == false){
                System.out.println("C " + i);
            }
        }

        for (int i = 1; i <= 13; i++) {
            if(list.contains("D " + i) == false){
                System.out.println("D " + i);
            }
        }
        */
    }

    static void findCard(String mark, ArrayList list){
    	for (int i = 1; i <= 13; i++) {
            if(list.contains(mark + " " + i) == false){
                System.out.println(mark + " " + i);
            }
        }
    }

}