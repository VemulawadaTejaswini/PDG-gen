import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String Sa = sc.next();
        int la = Sa.length();
        int a = 0;
        String Sb = sc.next();
        int lb = Sb.length();
        int b = 0;
        String Sc = sc.next();
        int c = 0;
        int lc = Sc.length();
        String x = "A";
        String y = "abc";

        for(int i=0; i<la+lb+lc+3; i++){
            if(x.equals("A")){
                if(a<la){
                    if(Sa.charAt(a)==y.charAt(0)){
                        x = "A";
                    }
                    else if(Sa.charAt(a)==y.charAt(1)){
                        x = "B";
                    }
                    else if(Sa.charAt(a)==y.charAt(2)){
                        x = "C";
                    }
                }
                a += 1;
                if(a==la+1){
                    x = "";
                }
            }
            else if(x.equals("B")){
                if(b<lb){
                    if(Sb.charAt(b)==y.charAt(0)){
                        x = "A";
                    }
                    else if(Sb.charAt(b)==y.charAt(1)){
                        x = "B";
                    }
                    else if(Sb.charAt(b)==y.charAt(2)){
                        x = "C";
                    }
                }
                b += 1;
                if(b==lb+1){
                    x = "";
                }
            }
            else if(x.equals("C")){
                if(c<lc){
                    if(Sc.charAt(c)==y.charAt(0)){
                        x = "A";
                    }
                    else if(Sc.charAt(c)==y.charAt(1)){
                        x = "B";
                    }
                    else if(Sc.charAt(c)==y.charAt(2)){
                        x = "C";
                    }
                }
                c += 1;
                if(c==lc+1){
                    x ="";
                }
            }

            if(a==la+1){
                System.out.println("A");
                break;
            }
            else if(b==lb+1){
                System.out.println("B");
                break;
            }
            else if(c==lc+1){
                System.out.println("C");
                break;
            }
        }
    }
}