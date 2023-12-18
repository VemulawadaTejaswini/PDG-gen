import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
     
    public void run() {
        while(true){
            int m=sc.nextInt(),f=sc.nextInt(),r=sc.nextInt();
            if(m==-1 && f==-1 && r==-1){
                break;
            }
            if(m!=-1 && f!=-1){
                if(m+f>=80){
                    ln("A");
                }else if(m+f >=65){
                    ln("B");
                }else if(m+f >=50){
                    ln("C");
                }else if(m+f >=30){
                    if(r>=50){
                        ln("C");
                    }else{
                        ln("D");
                    }
                }else{
                    ln("F");
                }
            }else{
                ln("F");
            }
        }
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    public static void pr(Object o) {
        System.out.print(o);
    }
 
    public static void ln(Object o) {
        System.out.println(o);
    }
 
    public static void ln() {
        System.out.println();
    }
}

Compile Error Logs:

ステータス
Judge:		CPU: sec	Memory: KB	Length: B	
テストケースの判定結果
Case #	Verdict	CPU Time	Memory	In	Out	Case Name
< prev |		/		| next >	 		
 
Judge Input #  ( | )		Judge Output #  ( | )

