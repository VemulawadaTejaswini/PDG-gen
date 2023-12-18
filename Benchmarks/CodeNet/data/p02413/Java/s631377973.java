import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int r=Integer.parseInt(sc.next());
int c=Integer.parseInt(sc.next());
int[][] rc=new int[r+1][c+1];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
    rc[i][j]=sc.nextInt();
   
    }
}
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
 rc[i][c]+=rc[i][j];
    rc[r][j]+=rc[i][j];
   
    }
}

for(int j=0;j<c+1;j++){
    for(int i=0;i<r+1;i++){
    if(i!=r){System.out.print(rc[i][j]+" ");}else{System.out.println(rc[i][j]);}
    }
}

}
}
