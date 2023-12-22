import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m,f,r;
        String rate="";
        while(true){
            m=sc.nextInt();
            f=sc.nextInt();
            r=sc.nextInt();
            if(m==-1 && f==-1 && r==-1){
                break;
            }else if(m==-1 || f==-1){
                rate="F";
            }else if(m+f>=80){
                rate="A";
            }else if(m+f>=65 && m+f<80){
                rate="B";
            }else if(m+f>=50 && m+f<65){
                rate="C";
            }else if(m+f>=30 && m+f<50){
                if(r>=50){
                    rate="C";
                }else{
                    rate="D";
                }
            }else if(m+f<30){
                rate="F";
            }
            System.out.println(rate);
        }
    }
}
