import java.io.PrintWriter;
import java.util.*; 
class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        while(sc.hasNext()){
            int temp1=sc.nextInt();
            int temp2=sc.nextInt();
            int temp3=sc.nextInt();
            int ans=0;
            for(int i=1;i<=10;i++)if(i!=temp1&i!=temp2&i!=temp3&i+temp1+temp2<=20)ans++;
            if (3<ans)out.println("YES");
            else   out.println("NO"); 
        }
        out.flush();
        out.close();
    }
}