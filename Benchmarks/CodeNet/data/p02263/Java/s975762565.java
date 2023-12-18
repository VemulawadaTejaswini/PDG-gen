import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] linesp = new String[line.length()];
        linesp=line.split(" ");
        
        ArrayList<Integer> figure = new ArrayList<Integer>();
        int save1=0;
        int save2=0;
        
        for(int i=0;i<linesp.length;i++){       	
        	switch(linesp[i]){
        	case "+":save1=figure.get(figure.size()-1);
					 figure.remove(figure.size()-1);
					 save2=figure.get(figure.size()-1);
				     figure.remove(figure.size()-1);
				     figure.add(save1+save2);
      		break;
        	case "-":save1=figure.get(figure.size()-1);
					 figure.remove(figure.size()-1);
					 save2=figure.get(figure.size()-1);
					 figure.remove(figure.size()-1);
					 figure.add(save2-save1);
    		break;        	
        	case "*":save1=figure.get(figure.size()-1);
			 		 figure.remove(figure.size()-1);
			 		 save2=figure.get(figure.size()-1);
			 		 figure.remove(figure.size()-1);
			 		 figure.add(save1*save2);
        	break;
        	default:figure.add(Integer.parseInt(linesp[i]));
    			break;
        	}
        }
        
        System.out.println(figure.get(0));
        
    }   
}