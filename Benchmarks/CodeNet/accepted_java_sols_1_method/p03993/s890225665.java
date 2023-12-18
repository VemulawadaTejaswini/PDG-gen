import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        int n=scan.nextInt();
        int []rab=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            rab[i]=scan.nextInt();
        }

        for(int i=0;i<n;i++){
            if(rab[rab[i]-1]==i+1)
                cnt++;
        }

        System.out.println(cnt/2);
    }

}