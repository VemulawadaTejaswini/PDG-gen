import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int ans=0;
        for(int i=0;i<n;i++){
            if(sc.nextInt()==count){
                ans++;
                count++;
            }
        }
        System.out.println(ans!=0?n-ans:-1);
        

    }



}