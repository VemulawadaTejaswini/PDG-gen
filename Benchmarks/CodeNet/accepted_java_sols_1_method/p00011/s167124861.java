import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int linenum;
        linenum=scan.nextInt();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=i+1;
        }
        int[][] sign=new int[linenum][2];
        String[] line=new String[linenum];
        for(int i=0;i<linenum;i++){
            line[i]=scan.next();
            String[] aaa=line[i].split(",",-1);
            sign[i][0]=Integer.parseInt(aaa[0]);
            sign[i][1]=Integer.parseInt(aaa[1]);
            int tmp=ans[sign[i][0]-1];
            ans[sign[i][0]-1]=ans[sign[i][1]-1];
            ans[sign[i][1]-1]=tmp;
        }
        for(int i=0;i<n;i++) System.out.println(ans[i]);
    }
}
