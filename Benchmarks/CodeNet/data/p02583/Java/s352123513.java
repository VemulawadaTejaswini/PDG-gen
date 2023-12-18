import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int n = nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = nextInt();
        }

        int max;
        int con =0;
        int tmp = 0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    //print(k);
                    if(arr[i] != arr[j] && arr[i] != arr[k] && arr[k] != arr[j]){
                        //System.out.printf("%d %d %d\n", arr[i],arr[j],arr[k]);
                        max = Math.max(arr[i], Math.max(arr[j],arr[k]));
                        //print(max);
                        if(max == arr[i]) tmp = arr[j] + arr[k];
                        else if(max == arr[k]) tmp = arr[j] + arr[i];
                        else if(max == arr[j]) tmp = arr[k] + arr[i];
                        if(tmp > max){
                            con +=1;
                        }
                        tmp = 0;
                    }
                }
            }
        }
        print(con);
    }


    public static int nextInt(){
        return Integer.parseInt(scan.next());
    }
    public static long nextLong(){
        return Long.parseLong(scan.next());
    }
    public static String next(){
        return scan.next();
    }
    public static double nextDouble(){
        return Double.parseDouble(scan.next());
    }
    public static float nextFloat(){
        return Float.parseFloat(scan.next());
    }

    //Yes or No
    public static void yesNo(boolean flag){
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }

    //print
    public static void print(Object a){
        System.out.println(a);
    }


    //gcd
    public static int gcd (int a, int b){
        int tmp;
        while((tmp = a%b) != 0){
            a = b;
            b = tmp;
        }
        return b;
    }


    //lcm
    public static int lcm(int a,int b){
        int tmp;
        long c = a;
        c *= b;
        while((tmp = a%b) != 0){
            a = b;
            b = tmp;
        }
        return (int)(c/b);
    }
}