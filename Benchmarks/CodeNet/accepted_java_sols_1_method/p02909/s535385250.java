import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String A[] = {"Sunny","Cloudy","Rainy","Sunny"};
        for(int i=0;i<3;i++){
            if(S.equals(A[i])){
                System.out.println(A[i+1]);
            }
        }
    }
}