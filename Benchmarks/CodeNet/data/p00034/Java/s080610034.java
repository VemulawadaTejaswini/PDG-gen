import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	
    Scanner sc =new Scanner(System.in);
    
    int l[]=new int[10];
        while(sc.hasNext()){
    	String []text = sc.nextLine().split(",");
        double dis=0.0; 
    	for(int i=0;i<10;i++){
        	l[i]=Integer.parseInt(text[i]); 
            dis+=l[i];
    	}

        double speed=Integer.parseInt(text[10])+Integer.parseInt(text[11]);  
        
        double time=dis/speed;
       
        double much=time*Integer.parseInt(text[10]);
        dis=0.0;
        for(int i=0;i<10;i++){
        	dis+=l[i];
        	if(dis>=much){
        		System.out.println(i+1);
        		break;
        	}
        }
    }
   }
}