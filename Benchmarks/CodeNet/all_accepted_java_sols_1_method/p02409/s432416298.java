import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,j,k,n,b,f,r,v;
        int build[][][]=new int[4][3][10];
        for(i=0;i<4;i++){
        	for(j=0;j<3;j++){
        		for(k=0;k<10;k++){
        			build[i][j][k]=0;
        		}
        	}
        }
        n=scan.nextInt();
        for(i=0;i<n;i++){
        	b=scan.nextInt()-1;
        	f=scan.nextInt()-1;
        	r=scan.nextInt()-1;
        	v=scan.nextInt();
        	build[b][f][r]+=v;
        }
        for(i=0;i<4;i++){
        	for(j=0;j<3;j++){
        		for(k=0;k<10;k++){
        			if(k==9){
        				System.out.println(" "+ build[i][j][k]);
        			}
        			else{
        				System.out.print(" " + build[i][j][k]);
        			}
        		}
        	}
        	if(i!=3){
        		System.out.println("####################");
        	}
        }
    }
}

