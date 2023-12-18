import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
        
        int n,i,j,k,l,a,b;
        //a=(n/4)+2;
        

    n=in.nextInt();
    int s=0;
    for(i=0;i<10;i++){
        for(j=0;j<10;j++){
                for(k=0;k<10;k++){
                    for(l=0;l<10;l++){
                        if(i+j+k+l==n)s++;
                }
            }
        }
    }
    //cout<<s<<endl;
    System.out.println(s);
    }
    }
}