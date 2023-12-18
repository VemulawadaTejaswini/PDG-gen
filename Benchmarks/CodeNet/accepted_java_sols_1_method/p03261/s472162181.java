import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=scn.next();
        }
        int flag=0;
        char b='a';
        for(int i=0;i<n;i++){
            char a=words[i].charAt(0);
            if(i>0&&a!=b){
                flag++;
                break;
            }
            b=words[i].charAt(words[i].length()-1);
            int f=0;
            for(int j=i+1;j<n;j++){
                if(words[i].equals(words[j])){
                    f++;
                    break;
                }
            }
            if(f>0){
                flag++;
                break;
            }
        }
        if(flag>0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}