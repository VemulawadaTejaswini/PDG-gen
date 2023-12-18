import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        String t[] = T.split("");
        int sum = 0;
        for(int i=0;i<t.length-1;i++)
        {
            char ch1 = t[i].charAt(0);
            if(ch == D){
                sum ++;
            }else{
                
            }
            char ch2 = t[i+1].charAt(0);
            if(ch1=='?'&&ch2=='?'){
                t[i] = "P";
                t[i+1] = "D";
                sum = 0;
            }else if(ch1=='?'&&ch2=='D'){
                if(sum>1){
                    t[i] = "D"
                    sum ++;
                }else{
                    t[i] = "P";
                }
            }else if(ch1=='?'&&ch2=='P'){
                t[i] = "D";
                sum = 0;
            }
        }
        for(String result : t){
            System.out.print(result);
        }
    }
}