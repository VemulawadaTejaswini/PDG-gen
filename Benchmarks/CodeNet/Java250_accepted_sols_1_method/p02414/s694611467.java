import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,j,k,a,b,c;
        long x[][];
        long y[][];
        long z[][];
        str = scan.nextLine();
        String[] num = str.split(" ", 0);
        a = Integer.valueOf(num[0]);
        b = Integer.valueOf(num[1]);
        c = Integer.valueOf(num[2]);
        x = new long[a][b];
        y = new long[b][c];
        z = new long[a][c];
       for(i=0;i<a;i++){
           str = scan.nextLine();
           num = str.split(" ", 0);
           for(j=0;j<b;j++){
               x[i][j] = Integer.valueOf(num[j]);
           }
       }
        for(i=0;i<b;i++){
            str = scan.nextLine();
            num = str.split(" ", 0);
            for(j=0;j<c;j++){
                y[i][j] = Integer.valueOf(num[j]);
            }
        }
        for(i=0;i<a;i++){
            for(j=0;j<c;j++){
                for(k =0;k<b;k++){
                    z[i][j] += x[i][k] * y[k][j];   
                }
            }
        }
        for(i=0;i<a;i++){
            for(j=0;j<c-1;j++){
                System.out.print(z[i][j]+" ");
            }
            System.out.println(z[i][j]);
        }


        scan.close();
    }

}


