package l1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String kosu=br.readLine();
            int nako=Integer.parseInt(kosu);
            String strArr[] = br.readLine().split(" ");
            int[] a=new int[nako];

            for(int j=0; j<nako; j++){
                a[j]=Integer.parseInt(strArr[j]);
            }

            for(int i=nako-1; i>=1; i--){
                System.out.print(a[i]+" ");
            }System.out.print(a[0]);



    }
}