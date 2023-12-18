public static void main(String[] args) {
			  int A = Input.getInt("数字入力>");
			  switch(A%10){
			  case 2:
			  case 4:
			  case 5:
			  case 7:
			  case 9:
				  System.out.println("hon");
				  break;
			  case 1:
			  case 6:
			  case 8:
				  System.out.println("pon");
			  case 3:
				  System.out.println("bon");
			  }     
	}

}
