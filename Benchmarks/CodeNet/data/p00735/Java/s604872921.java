import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int max = 300000;
	int[] list = new int[max];
	int a = 6;
	int b = 8;
	for(int i=6; i<list.length; i+=7){list[i] = 1;}
	for(int i=8; i<list.length; i+=7){list[i] = 1;}
	for(int i=6; i<Math.sqrt(max)+1; i+=7){
	    for(int j=i*2; j<max; j+=i){
		list[j] = 0;
	    }
	}
	for(int i=8; i<Math.sqrt(max)+1; i+=7){
	    for(int j=i*2; j<max; j+=i){
		list[j] = 0;
	    }
	}
	
	int monday = sc.nextInt();
	
	while(monday!=1){
	    List<Integer> mylist = new ArrayList<Integer>();
	    boolean hantei = false;
	    for(int i=0; i<max; i++){
		if(list[i]>=monday){break;}
		if(list[i]==1 && monday%i==0 && !mylist.contains(i)){
		    mylist.add(i);
		}
	    }
	    
	    if(mylist.size()==0){mylist.add(monday);}

	    String ans = "";
	    for(int i=0; i<mylist.size(); i++){
		ans += mylist.get(i)+" ";
	    }

	    System.out.println(monday+": "+ans);

	    monday = sc.nextInt();
	}
    }
}