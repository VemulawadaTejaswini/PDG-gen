import java.util.Scanner;
class Main {

  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int a=0;
while(sc.hasNext()) {
	String str=sc.next();
	//get char array from String
	char[] charArray = str.toCharArray();

	//process chars one by one
	for(int i=0; i < charArray.length; i++){

	    //if char is uppercase, make it lower case
	    if( Character.isUpperCase(charArray[i]) ){

	        charArray[i] = Character.toLowerCase( charArray[i] );

	    }else if(Character.isLowerCase(charArray[i]) ){

	        charArray[i] = Character.toUpperCase( charArray[i] );
	    }

	}

	//convert modified char array back to String
	str = new String(charArray);
if(a>0){
    System.out.print(" ");
}
	System.out.print(str);
	a+=1;
}
System.out.println();
sc.close();
  }


}

