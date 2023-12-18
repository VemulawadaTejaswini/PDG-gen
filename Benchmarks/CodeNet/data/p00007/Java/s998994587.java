package com.plactice.template.syakkin;


class Main {
    public static void main(String[] args) {
    	double initialValue = 100000.0;

    	for( int i = 0 ; i <= 100 ; i++ )
    	{
    	    double interest = initialValue * 0.05;
    	    initialValue = initialValue + interest;
    	    System.out.println(initialValue);
    	    initialValue = initialValue / 1000;
    	    System.out.println(initialValue);
    	    initialValue = Math.ceil(initialValue);
    	    System.out.println(initialValue);
    	    initialValue = initialValue * 1000;
    	    System.out.println(initialValue);
    	}
    	System.out.println(initialValue);
    }
}