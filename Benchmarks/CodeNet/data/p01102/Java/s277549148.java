import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        Main m = new Main();
        m.run();
    }

    String I = "IDENTICAL";
    String C = "CLOSE";
    String D = "DIFFERENT";

    void run(){
        for(;;) {
            String s1 = sc.nextLine();
            if(s1.equals(".")){
                break;
            }
            String s2 = sc.nextLine();
            s1 = s1.replace('"', '#');
            s2 = s2.replace('"', '#');
            s1 =s1.replaceAll("#","#dummy");
            s2 =s2.replaceAll("#","#dummy");


            String ss1[] = s1.split("#");
            String ss2[] = s2.split("#");

            if (ss1.length != ss2.length){
                System.out.println(D);
                continue;
            }

            int count =0 ;
            boolean d = false;
            for(int i = 0 ; i< ss1.length ;i++){
                if(!ss1[i].equals(ss2[i])) {
                    if (i % 2 == 0) {
                        d= true;
                    } else {
                        count++;
                    }
                }
            }

            if(!d && count == 0){
                System.out.println(I);
            }else if(!d && count ==1){
                System.out.println(C);

            }else{
                System.out.println(D);
            }
        }
    }

}

