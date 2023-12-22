import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Apart{
    private int[][][] apart;
    public Apart(){
	apart=new int[4][][];
	for(int i=0;i<4;i++){
	    apart[i]=new int[4][];
	    for(int j=0;j<3;j++){
		apart[i][j]=new int[10];
		for(int k=0;k<10;k++){
		    apart[i][j][k]=0;
		}
	    }
	}
    }
    
    public void insert(int b,int f,int r,int v){
	apart[b-1][f-1][r-1]+=v;
    }

    public void print(){
	for(int i=0;i<4;i++){
	    for(int j=0;j<3;j++){
		for(int k=0;k<10;k++){
		    System.out.print(" "+apart[i][j][k]);
		}
		System.out.println("");
	    }
	    if(i!=4-1) System.out.println("####################");
	}
    }
}

class Main{
    public static void main(String[] args) throws IOException{
	final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	final Apart ap=new Apart();
	String str=br.readLine();
	int n=Integer.parseInt(str);
	for(int i=0;i<n;i++){
	    String[] str2=br.readLine().split(" ");
	    int b=Integer.parseInt(str2[0]);
	    int f=Integer.parseInt(str2[1]);
	    int r=Integer.parseInt(str2[2]);
	    int v=Integer.parseInt(str2[3]);
	    ap.insert(b,f,r,v);
	}
	ap.print();
    }
}