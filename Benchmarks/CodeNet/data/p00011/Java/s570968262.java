import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w;
        w = sc.nextInt();
        int [] array;
        array = new int[w];
        int n;
        n = sc.nextInt();
        int i;
        for(i=0;i<w;i++){
            array[i] = i+1;
        }
        int a=0;
        int b=0;
        int swap;
        String str;
        String [] num = new String[2];
        for(i=0;i<n;i++){
            str = sc.next();
            num = str.split(",", 0);
            a=Integer.parseInt(num[0])-1;
            b=Integer.parseInt(num[1])-1;
            swap = array[a];
            array[a] = array[b];
            array[b] = swap;
            swap=0;
        }

        for(i=0;i<w;i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
