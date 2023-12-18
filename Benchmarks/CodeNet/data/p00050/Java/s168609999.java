public class Main{
    public static void main(String[] args){
	for(int i = 0; i < args.length; i++){
	    if(args[i].startsWith("apple")){
		args[i] = args[i].replaceFirst("apple", "peach");
	    }
	    else if(args[i].startsWith("peach")){
		args[i] = args[i].replaceFirst("peach", "apple");
	    }
	}

	for(int i = 0; i < args.length; i++){
	    if(i != 0) System.out.print(" ");
	    System.out.print(args[i]);
	}
	System.out.println();
    }
}