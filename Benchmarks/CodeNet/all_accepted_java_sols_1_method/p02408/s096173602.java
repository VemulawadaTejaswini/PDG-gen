import java.util.Scanner;
public class Main{
	public static void main(String[] args){

        Scanner s = new Scanner(System.in);
		int n,i,j,kai=0;					//kai=回数
        String mark;
        kai = s.nextInt();
        int[][] gya=new int[4][13];		//逆列
        
        for(i=0;i<4;i++)
            for(j=0;j<13;j++)
                gya[i][j]=0;
        
        //S=0,H=1,D=2,C=3
		for(i=0;i<kai;i++){
            mark = s.next();
			n = s.nextInt();
            if(mark.equals("S"))gya[0][n-1]=1;
            else if(mark.equals("H"))gya[1][n-1]=1;
            else if(mark.equals("C"))gya[2][n-1]=1;
            else gya[3][n-1]=1;
        }
        for(i=0;i<4;i++){
            for(j=0;j<13;j++){
                if(gya[i][j]==0&&i==0)System.out.println("S "+(j+1));
                else if(gya[i][j]==0&&i==1)System.out.println("H "+(j+1));
                else if(gya[i][j]==0&&i==2)System.out.println("C "+(j+1));
				else if(gya[i][j]==0&&i==3)System.out.println("D "+(j+1));
            }
        }
		s.close();
	}
}
