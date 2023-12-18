import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int i,j;
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        Matrix A=new Matrix(n,m);
        for(i=0;i<n;i++){
            for(j=0;j<m;j++)A.setElement(i,j,sc.nextInt());
        }
        
        Matrix B=new Matrix(m,1);
        for(i=0;i<m;i++)B.setElement(i,0,sc.nextInt());
        
        Matrix C=new Matrix(n,1);
        C.product(A,B);
        C.printElement();
    }
}
class Matrix{
    private int row;
    private int col;
    private int elm[][];
    Matrix(int a,int b){
        this.row=a;
        this.col=b;
        elm=new int[a][b];
    }
    void setElement(int a,int b,int x){
        this.elm[a][b]=x;
    }
    void printElement(){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++){
                if(j==0)System.out.printf("%d",this.elm[i][j]);
                else System.out.printf(" %d",this.elm[i][j]);
            }
            System.out.printf("\n");
        }
    }
    void product(Matrix a,Matrix b){
        if(a.col!=b.row){
            System.out.println("wrong input");
            System.exit(0);
        }
        
        for(int i=0;i<a.row;i++){
            for(int k=0;k<b.col;k++){
                for(int j=0;j<a.col;j++){
                    this.elm[i][k]+=a.elm[i][j]*b.elm[j][k];
                }
            }
        }
    }
}
