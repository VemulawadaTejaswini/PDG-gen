import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
    public static void main(String[] args) throws Exception {
        int[] x = new int[10001];
        String[] z = new String[3001];
        String str;
        int a=0,b=0,c=1,i=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        for (i=1;c!=0;i++) {
            str = br.readLine();
            z = str.split(" ");
            a = Integer.parseInt(z[0]);
            b = Integer.parseInt(z[1]);
            if (a>b) {
                c=a;
                a=b;
                b=c;
            }
            c=a+b;
            x[i]=a;
            i++;
            x[i]=b;
        }
        i--;
        i--;
        i--;
        while(i>0){
            c++;
            System.out.print(x[c]);
            System.out.print(" ");
            c++;
            System.out.println(x[c]);
            i--;
            i--;
        }
    }
}
