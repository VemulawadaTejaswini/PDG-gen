import java.util.*;
public class Main {
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
       //Queue<Pair> fifo = new LinkedList<Pair>();
        int rank [] ={0,0,0,0,0,0};
      //  ArrayList <Double> mou =new ArrayList <Double>();
        int c =scan.nextInt();
        while (c!=0){
        	double n=scan.nextDouble();
        if(n>=185.0)rank[5]++;
        else if(n>=180.0)rank[4]++;
        else if(n>=175.0)rank[3]++;
        else if(n>=170.0)rank[2]++;
        else if(n>=165.0)rank[1]++;
        else rank[0]++;
        
        
  c--;
        		}
        for(int i=0;i<6;i++){
        	if(rank[i]==0)System.out.println(i+":");
        	else {
        		String str="";
        		for(int j=0;j<rank[i];j++)
        			str+="*";
        			
        		System.out.println(i+":"+str);
        	}
        	}
        	}
        	
     
        }
      