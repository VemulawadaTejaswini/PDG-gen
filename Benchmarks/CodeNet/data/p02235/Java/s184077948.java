import java.util.Scanner;
public class Main{
    public static void main(String[]args){
	int i,n;
	Scanner sca = new Scanner(System.in);
	n=sca.nextInt();
	for(i=0;i<n;i++){
	    System.out.println(solveLCS(sca.next(),sca.next()));
	}
    }
    public static int solveLCS(String a,String b){
	int i,j;
	String[]x=a.split("");
	String[]y=b.split("");
	int[][]cont=new int[x.length+1][y.length+1];
	for(i=0;i<=x.length;i++)cont[i][0]=0;
	for(i=0;i<=y.length;i++)cont[0][i]=0;
	for(i=1;i<=x.length;i++){
	    for(j=1;j<=y.length;j++){
		if(x[i-1].equals(y[j-1])){
		    cont[i][j]=cont[i-1][j-1]+1;
		}else if(cont[i][j-1]>cont[i-1][j]){
			cont[i][j]=cont[i][j-1];
	        }else{
		    cont[i][j]=cont[i-1][j];
		    }
		
		}
	}
	    return cont[x.length][y.length];
    }
}


