import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] AC = s.split("");
        boolean ans = true; 
        int cc = 0;
        if(AC[0].equals("A")){
            for(int i = 1; i < AC.length; i++){
                if(AC[i].toUpperCase().equals(AC[i])){
                    if(i == 1 || i == AC.length-1){
                        ans = false;
                    }else{
                        if(AC[i].equals("C")){
                            cc ++;
                        }else{
                            ans = false;
                        }
                    }
                }
            }
        }else{
            ans = false;
        }
        if(cc != 1){
            ans = false;
        }
        if(ans){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
}
