import java.util.*;

class Main
{
    //I don't want to make here.
    public static int hight=0;

    //Tree class
    static class Tree
    {
	int id;
	Tree parent = null;
	Tree left = null;
	Tree right = null;

	public void setId(int n)
	{
	    id = n;
	}

	public void setParent(Tree p)
	{
	    parent = p;
	}

	public void setDegree(Tree l, Tree r)
	{
	    left=l;
	    right=r;
	}
    }

    public static void main(String args[])
    {
	Tree[] t = new Tree[1000];

	int n;
	int id, left, right;

	Scanner read = new Scanner(System.in);
	int length;
	int i, j, k;

	//initialization
	for(i=0; i<1000; i++)t[i] = new Tree();

	//make tree
	n = read.nextInt();

	//set first
	id = read.nextInt();
	left = read.nextInt();
	right = read.nextInt();
	//id
	t[0].setId(id);
	t[1].setId(left);
	t[2].setId(right);
	//parent
	t[1].setParent(t[0]);
	t[2].setParent(t[0]);
	//dgree
	t[0].setDegree(t[1], t[2]);

	length=3;
	for(i=1; i<n; i++)
	    {
		id = read.nextInt();
		left = read.nextInt();
		right = read.nextInt();

		//serch id
		for(j=0; j<=length; j++)
		    {
			if(t[j].id==id)break;
		    }

		//set id
		t[length].setId(left);
		t[length+1].setId(right);

		//set parent
		t[length].setParent(t[j]);
		t[length+1].setParent(t[j]);

		//set degree
		t[j].setDegree(t[length], t[length+1]);

		length+=2;
	    }

	//print
	//for(i=1; i<length; i++)if(t[i].id!=-1)System.out.println(t[i].id+" "+t[i].parent.id+" "+t[i].left.id+" "+t[i].right.id);
	visit(t[0]);
    }

    //visit method is preoder
    static void visit(Tree t)
    {
	int node=0, degree, depth;

	if(t.id!=-1)
	    {
		//node
		System.out.print("node "+node+": ");
		node++;
		
		//parent
		System.out.print("parent = ");
		if(t.parent!=null)System.out.print(t.parent.id+", ");
		else System.out.print("-1"+", ");
	
		//sibling
		System.out.print("sibling = ");
		if(t.parent==null)System.out.print("-1"+", ");
		//t.palent.left.equals(t)?
		else if(t.parent.left.id != t.id)System.out.print(t.parent.left.id+", ");
		else System.out.print(t.parent.right.id+", ");
		
		//degree
		degree=0;
		if(t.left.id!=-1)degree++;
		if(t.right.id!=-1)degree++;
		System.out.print("degree = "+degree+", ");
		
		//depth
		depth=0;
		for(Tree tree=t; tree.parent!=null; tree=tree.parent)depth++;
		System.out.print("depth = "+depth+", ");
		
		//height
		hight=0;
		getHight(t, hight);
		System.out.print("height = "+hight+", ");

		//type
		if(t.parent==null)System.out.println("root");
		else if(t.parent!=null && (t.left.id!=-1 || t.right.id!=-1))System.out.println("internal node");
		else System.out.println("leaf");

		visit(t.left);
		visit(t.right);
	    }
    }

    static void getHight(Tree t, int n)
    {
	if(n>hight)hight=n;

	if(t.left.id!=-1)getHight(t.left, n+1);
	if(t.right.id!=-1)getHight(t.right, n+1);
    }
}