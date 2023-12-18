import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,j,a,b;
        int x[][];
        str = scan.nextLine();
        String[] num = str.split(" ", 0);
        a = Integer.valueOf(num[0]);
        b = Integer.valueOf(num[1]);
        x = new int[a+1][b+1];
       for(i=0;i<a;i++){
           str = scan.nextLine();
           num = str.split(" ", 0);
           for(j=0;j<b;j++){
               x[i][j] = Integer.valueOf(num[j]);
               x[i][b] += x[i][j];
               x[a][j] += x[i][j];
               x[a][b] += x[i][j];
           }
       }
        for(i=0;i<a+1;i++){
            for(j=0;j<b;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println(x[i][j]);
        }


        scan.close();
    }

}

