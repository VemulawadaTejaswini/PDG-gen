import java.io.*;
class Main
{
public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int K=Integer.parseInt(br.readLine());
    String S=br.readLine();
    String tokens[]=S.split(" ");
    int A=Integer.parseInt(tokens[0]);
    int B=Integer.parseInt(tokens[1]);
    int result=multiple(A,B,K);
    if (result==1)
        System.out.print("OK");
    else
        System.out.print("NG");
}

static int multiple(int a, int b,int x){

    int f=0;
    for (int i=a;i<=b;i++)
    {
        if(i%x==0)
            {f=1;
            break;
            }

    }
    return f;
}

}