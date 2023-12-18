import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine().toLowerCase();
        String s;
        int ans=0;
        while(sc.hasNextLine()){
            s=sc.nextLine();
            if(s.equals("END_OF_TEXT")){
                break;
            }
            String[] st=s.toLowerCase().split(" ");
            for(int i=0;i<st.length;i++){
                if(st[i].equals(t))ans++;
            }
        }
        System.out.println(ans);
    }
}