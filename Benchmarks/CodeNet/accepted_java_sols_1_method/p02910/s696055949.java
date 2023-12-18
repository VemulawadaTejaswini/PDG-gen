import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String tapDance = sc.next();
        boolean returnBoo = true;
        String[] tapDanceAr = tapDance.split("");
        for(int i = 0;i < tapDanceAr.length;i++){
            if(tapDanceAr[i].equals("R") || tapDanceAr[i].equals("U") || tapDanceAr[i].equals("L") ||tapDanceAr[i].equals("D")){
                if(i % 2 == 0){
                    if(tapDanceAr[i].equals("L") ){
                        returnBoo = false;
                        break;
                    }
                } else{
                    if(tapDanceAr[i].equals("R") ){
                        returnBoo = false;
                        break;
                    }
                }          
            } else{
                returnBoo = false;
                break;
            }
        }

        if(returnBoo){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}