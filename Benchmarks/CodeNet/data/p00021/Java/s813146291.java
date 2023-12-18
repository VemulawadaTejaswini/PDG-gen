import java.io.*;
 
class Main{
    public static void main(String[] args){
    try{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String st = sc.readLine();
        int n = Integer.valueOf(st);
        for(int i=0; i<n; i++){
        String[] pt = sc.readLine().split(" ");
        double[] a = new double[8];
        for(int j=0; j<8; j++)
            a[j] = Double.valueOf(pt[j]);
        if((a[3]-a[1])/(a[2]-a[0]) == (a[7]-a[5])/(a[6]-a[4]))
            System.out.println("YES");
        else
            System.out.println("NO");
        }
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}