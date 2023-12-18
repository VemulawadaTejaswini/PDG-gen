import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] uho=new String[n];
        for(int i=0;i<n;i++){
            uho[i]=sc.nextLine();
        }
        Arrays.sort(uho);
        System.out.println(uho[0]);
    }
}