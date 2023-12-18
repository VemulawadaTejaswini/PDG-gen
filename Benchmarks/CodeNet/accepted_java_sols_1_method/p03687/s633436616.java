/**
 * Created by yoshiwaratomohiro on 2017/06/18.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int[] snum = new int[s.length()];
        for(int i=0;i<s.length();i++){
            snum[i]=s.charAt(i)-'a';
        }

        int min=10000;
        for(int i=0;i<26;i++){
            int[] ans = new int[s.length()];
            for(int j=0;j<s.length();j++){
                ans[j]=i;
            }

            int s_[] = new int[s.length()];
            for(int j=0;j<s.length();j++){
                s_[j]=snum[j];
            }


 inside:           for(int j=0;j<s.length();j++){
                for(int k=0;k<s_.length;k++){
                    if(s_[k]!=i){
                        break;
                    }
                    if(k==s_.length-1){
                        min=Math.min(min,j);
                        break inside;
                    }
                }


                    int[] conv=new int[s.length()-j-1];

                for(int k=1;k<s.length()-j;k++){
                    if(s_[k-1]==i||s_[k]==i){
                        conv[k-1]=i;
                    }else{
                        conv[k-1]=s_[k-1];
                    }
                }
                s_=new int[s.length()-j-1];
                for(int k=0;k<s.length()-j-1;k++){
                    s_[k]=conv[k];
                }
            }
        }
        System.out.println(min);
    }
}
