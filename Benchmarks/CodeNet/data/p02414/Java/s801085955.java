import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int i,j;
        
        Scanner sc=new Scanner(System.in);
        
        int n,m,l;
        n=sc.nextInt();
        m=sc.nextInt();
        l=sc.nextInt();
 
        Matrix A=new Matrix(n,m);
        for(i=0;i<n;i++){
            for(j=0;j<m;j++)A.setElement(i,j,sc.nextInt());
        }
        
        Matrix B=new Matrix(m,l);
        for(i=0;i<m;i++){
            for(j=0;j<l;j++)B.setElement(i,j,sc.nextInt());
        }
        
        Matrix C=new Matrix(n,l);
        C.getProduct(A,B);
        C.printElement();
    }
}

class Matrix{
    int row;
    int col;
    long elm[][];
    Matrix(int a,int b){
        this.row=a;
        this.col=b;
        elm=new long[a][b];
        this.initialize();
    }
    void initialize(){
        for(int i=0;i<this.row;i++){
            for(int j=0;j<this.col;j++)this.elm[i][j]=0;
        }
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
    void getProduct(Matrix a,Matrix b){
        for(int i=0;i<a.row;i++){
            for(int k=0;k<b.col;k++){
                for(int j=0;j<b.row;j++){
                    this.elm[i][k]+=a.elm[i][j]*b.elm[j][k];
                }
            }
        }
    }
}
