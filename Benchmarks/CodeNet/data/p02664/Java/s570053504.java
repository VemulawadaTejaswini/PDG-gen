import java.util.*;
import java.lang.*;
public class Main{


    public static String solve(String str){
        int n = str.length();
        char ans[] = new char[n];
        for(int i = str.length() - 1 ; i>= 0 ; i--){
            if(i == n-1){
                if(str.charAt(i) == '?'){
                    ans[i] = 'D';
                }else{
                    ans[i] = str.charAt(i);
                }
            }
            else if(i == 0){
                if(str.charAt(i) == '?'){
                    if(str.charAt(i+1) == 'D'){
                        ans[i] = 'P';
                    }else{
                        ans[i] = 'D';
                    }
                }else{
                    ans[i] = str.charAt(i);
                }
            }
            else{
                if(str.charAt(i) == '?'){
                    if(ans[i+1] == 'D'){
                        ans[i] = 'P';
                    }else{
                        ans[i] = 'D';
                    }
                }else{
                    ans[i] = str.charAt(i);
                }
            }
        }

        return String.valueOf(ans);
    }


    public static void gora(){
        Scanner scn = new Scanner(System.in);
        
        String str = scn.nextLine();
            System.out.println(solve(str));
        // }
    }

    public static void main(String args[]){
        gora();
    }
}