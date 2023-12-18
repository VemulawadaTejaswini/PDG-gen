import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] data = new int[M][4];//i, p, y, idx
        for(int i = 0; i < M; i++){
            data[i][0] = i;
            data[i][1] = sc.nextInt();
            data[i][2] = sc.nextInt();
            data[i][3] = 0;
        }
        sc.close();
        Arrays.sort(data, (x, y) -> x[1]==y[1] ? x[2]-y[2] : x[1]-y[1]);
        int a = 0;
        int b = 0;
        for(int i=0; i<M; i++){
            if(data[i][1] != a){
                a = data[i][1];
                b = 0;
            }
            data[i][3] = ++b;
        }
        Arrays.sort(data, (x, y) -> x[0]-y[0]);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            int data1 = data[i][1];
            int data3 = data[i][3];
            if(data1 < 10){ sb.append("00000");}
            else if (data1 < 100){ sb.append("0000");}
            else if (data1 < 1000){ sb.append("000");}
            else if (data1 < 10000){ sb.append("00");}
            else if (data1 < 100000){ sb.append("0");}
            sb.append(data1);
            if(data3 < 10){ sb.append("00000");}
            else if (data3 < 100){ sb.append("0000");}
            else if (data3 < 1000){ sb.append("000");}
            else if (data3 < 10000){ sb.append("00");}
            else if (data3 < 100000){ sb.append("0");}
            sb.append(data3);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

}
