import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int[] A=new int[4];
        A[0]=Character.getNumericValue(S.charAt(0));
        A[1]=Character.getNumericValue(S.charAt(1));
        A[2]=Character.getNumericValue(S.charAt(2));
        A[3]=Character.getNumericValue(S.charAt(3));
        
        int ans=A[0];
        
        for(int i=0;i<(1<<3);i++){
            for(int j=0;j<3;j++){
                if((1&(i>>j))==1){
                    ans+=A[j+1];
                }else{
                    ans-=A[j+1];
                }
            }
            
            if(ans==7){
                System.out.print(A[0]);
                for(int j=0;j<3;j++){
                    if((1&(i>>j))==1){
                        System.out.print("+"+A[j+1]);
                    }else{
                        System.out.print("-"+A[j+1]);
                    }
                }
                System.out.println("=7");
                break;
            }
            
            ans=A[0];
        }
    }
}