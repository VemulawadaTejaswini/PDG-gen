import java.util.*;

class Main
{
    //I want you to write the problem very clear because I missed writting program many time......

    //I don't want to make here.
    public static int hight=0;
    public static int node=0;
    public static int degree=0, depth=0;

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
	Tree tree = new Tree();
	int n;
	int id, left, right;

	Scanner read = new Scanner(System.in);
	int length;
	int idFlag, leftFlag, rightFlag;
	int i, j, k;

	//initialization
	for(i=0; i<1000; i++)t[i] = new Tree();

	//make tree
	n = read.nextInt();
	t[0].id=-1;

	length=0;
	for(i=0; i<n; i++)
	    {
		id = read.nextInt();
		left = read.nextInt();
		right = read.nextInt();

		//find id, left and right
		idFlag=-1;
		leftFlag=-1;
		rightFlag=-1;
		for(j=0; j<length; j++)
		    {
			if(t[j].id==id)idFlag=j;
			if(t[j].id==left && t[j].id!=-1)leftFlag=j;
			if(t[j].id==right && t[j].id!=-1)rightFlag=j;

			if(idFlag!=-1 && leftFlag!=-1 && rightFlag!=-1)break;
		    }

		//if it cannot find id, make node
		if(idFlag==-1){
		    t[length].setId(id);
		    idFlag=length;
		    length++;
		}
		if(leftFlag==-1){
		    t[length].setId(left);
		    leftFlag=length;
		    length++;
		}
		if(rightFlag==-1){
		    t[length].setId(right);
		    rightFlag=length;
		    length++;
		}

		//set parent
		t[leftFlag].setParent(t[idFlag]);
		t[rightFlag].setParent(t[idFlag]);
		
		//set degree
		t[idFlag].setDegree(t[leftFlag], t[rightFlag]);
	    }

	//print
	//for(i=1; i<length; i++)if(t[i].id!=-1)System.out.println(t[i].id+" "+t[i].parent.id+" ");//+t[i].left.id+" "+t[i].right.id);
	System.out.println("Preorder");
	preorder(t[0]);
	System.out.println("");

	System.out.println("Inorder");
	inorder(t[0]);
	System.out.println("");

	System.out.println("Postorder");
	postorder(t[0]);
	System.out.println("");
    }


    //method
    static void preorder(Tree t)
    {
	if(t.id!=-1)
	    {
		System.out.print(" "+t.id);
		preorder(t.left);
		preorder(t.right);
	    }
    }

    static void inorder(Tree t)
    {
	if(t.id!=-1)
	    {
		inorder(t.left);
		System.out.print(" "+t.id);
		inorder(t.right);
	    }
    }
    
    static void postorder(Tree t)
    {
	if(t.id!=-1)
	    {
		postorder(t.left);
		postorder(t.right);
		System.out.print(" "+t.id);
	    }
    }
}