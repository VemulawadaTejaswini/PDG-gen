import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt();
        String S = sc.next();
        int i=0,j=S.length()-1,c=0;
        while(i<j){
            if(S.charAt(i)=='W'){
                while(i<j){
                    if(S.charAt(j)=='R'){
                        c++;
                        j--;
                        i++;
                        break;
                    }
                    else{
                        j--;
                    }
                }
            }else{
                i++;
            }
        }
        System.out.println(c);
    }
}