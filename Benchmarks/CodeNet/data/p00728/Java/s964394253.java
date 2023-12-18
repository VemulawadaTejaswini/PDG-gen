import java.util.*; 
public class Main{
    public static void main(String[] args){
    int n;
    Scanner sc =new Scanner(System.in);
    n = sc.nextInt();
    if(n==0){
        System.exit(0);
    }
    int[] s;
    int i=0;
    int max=0;
    int min=1000;
    while(i<n){
        s[i]=sc.nextInt();
        if(s[i]>max){
            max=s[i];
        }
        else if(s[i]<min){
            min=s[i];
        }    
        i++;
    }
    int sum=0;
    i=0;
    int c=0;
    int c2=0;
    while(i<n){
        if(s[i]!=min && s[i]!=max){
            sum+=s[i];
        }else if(s[i]==max){
            c++;
        }else if(s[i]==min){
            c2++;
        }
        i++;
    }    
    sum+=max*(c-1);
    sum+=min*(c2-1);
    int average=0;
    average=sum/(n-2);
    SyStem.out.println(agerage);
    }
}
