import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        int sets=s.nextInt();
        for(int i=0; i<sets; i++) {
        	String now=s.nextLine();
            char ans[]=now.toCharArray();
            for(int j=0;j<now.length()-6;j++){
                if(now.substring(i,i+7).equals("Hoshino")){
                    ans[i]='H';
                    ans[i+1]='o';
                    ans[i+2]='s';
                    ans[i+3]='h';
                    ans[i+4]='i';
                    ans[i+5]='n';
                    ans[i+6]='a';
                }
            }
            System.out.println(new String(ans));
        }
    }
}
