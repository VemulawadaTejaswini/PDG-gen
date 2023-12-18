import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        //System.out.println(n);
        while(n != 0) {
            Score s = new Score();
            for (int i = 0; i < n; i++){
                String new_line = bf.readLine();
                String[] data = new_line.split(" ");
                int a = Integer.parseInt(data[0]);
                int b = Integer.parseInt(data[1]);
                s.openCard(a,b);
                //System.out.println("a = " + a + "  b = " + b);
            }
            s.print();
            n = Integer.parseInt(bf.readLine());
        }
        //System.out.print("finish");
    }
}

class Score{
    int A=0 ,B =0;
    public Score(){
    }
    public void openCard(int a, int b){
        if(a>b){
            A += (a+b);
            return;
        }
        if(b > a){
            B += (a+b);
            return;
        }
        A += a;
        B += b;
    }
    public void print(){
        System.out.print(A+" "+B);
    }
}