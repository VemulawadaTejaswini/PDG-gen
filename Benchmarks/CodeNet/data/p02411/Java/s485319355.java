import java.util.Scanner;
	class Main {
	public static void main(String[] args){
        
		Scanner s = new Scanner(System.in);
		int i,m,f,r;
        boolean sw=true;
        //試験開始
     		      m=s.nextInt();
      			  f=s.nextInt();
       			  r=s.nextInt();
        
        if(m==-1&&f==-1&&r==-1)
            sw=false;
        
        while(sw){
            if(m==-1 || f==-1)
                System.out.println("F");
            
            else if((m+f)>=80)
                System.out.println("A");
            
            else if((m+f)>=65)
                System.out.println("B");
            
            else if((m+f)>=50 || r>=50)
                System.out.println("C");
            
           else if((m+f)>=30)
                System.out.println("D");
            
           else
                System.out.println("F");
            
                  m=s.nextInt();
      			  f=s.nextInt();
       			  r=s.nextInt();
            
            if(m==-1&&f==-1&&r==-1)
            sw=false;
        }
	}
}
