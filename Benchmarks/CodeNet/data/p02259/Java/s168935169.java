	    for(int j = array.length-1; j > i; j--){
		if( array[j] < array[j-1]){
		    t = array[j];
		    array[j] = array[j-1];
		    array[j-1] = t;
		    cnt++;
		}
	    }
	}
	for(int x : array)
	    System.out.print(x+" ");
	System.out.println();
	System.out.println(cnt);
    }
}