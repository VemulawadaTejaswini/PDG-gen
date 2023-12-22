import java.awt.*;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            char[] c=sc.nextLine().toCharArray();
//            long x=1;
//            for(int j=0;j<10;j++){
//                x=x*s.charAt(j);
//            }
//            arr.add(x);
            Arrays.sort(c);
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<10;j++){
                sb.append(c[j]);
            }
            arr.add(sb.toString());
        }
        Collections.sort(arr);
        long z=0;
        long temp=0;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i).equals(arr.get(i+1))){
                temp++;
            }
            else{
                z=z+temp*(temp+1)/2;
                temp=0;
            }
        }
        z=z+temp*(temp+1)/2;
        System.out.println(z);

    }
}