import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(true){
            int i,j=0;
            String a =sc.nextLine();
            if(a.equals(".")){
                break;
            }

            int[] rec=new int[a.length()];

            for(i=0;i<a.length();i++){
                String fch=String.valueOf(a.charAt(i));
                if(fch.equals("(")){
                    j++;
                    rec[j]=1;
                }else if(fch.equals(")")){
                    if(rec[j]==1){
                        j--;
                    }else{
                        rec[0]=1;
                        break;
                    }
                }else if(fch.equals("[")){
                    j++;
                    rec[j]=2;
                }else if(fch.equals("]")){
                    if(rec[j]==2){
                        j--;
                    }else{
                        rec[0]=1;
                        break;
                    }
                }
            }
            if(j==0 && rec[0]==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
