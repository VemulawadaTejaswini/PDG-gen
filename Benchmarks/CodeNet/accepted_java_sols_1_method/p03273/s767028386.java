import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String[] ar=new String[r];
        TreeSet<Integer> setRow=new TreeSet<Integer>();
        TreeSet<Integer> setCol=new TreeSet<Integer>();
        for(int i=0;i<r;i++){
            ar[i]=sc.next();
            if(!ar[i].contains("#")){
                setRow.add(i);
            }
        }
        char[][] ch=new char[r][c];
        for(int i=0;i<r;i++){
            ch[i]=ar[i].toCharArray();
        }
        boolean b=false;
        for(int j=0;j<c;j++){
            b=false;
            for(int i=0;i<r;i++){
                //System.out.println("C");
                if(ch[i][j]=='#'){
                    //System.out.println("B");
                    b=true;
                    break;
                }
            }
            if(b==false){
                //System.out.println("A");
                setCol.add(j);
            }
            //System.out.println("j="+j);
        }
        for(int i=0;i<r;i++){
            if(!setRow.contains(i)){
                for(int j=0;j<c;j++){
                    if(!setCol.contains(j)){
                        System.out.print(ch[i][j]);
                    }
                }      
            System.out.println();
            }
        }
    }  
}